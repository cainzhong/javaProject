package org.example;/**
 * TODO
 *
 * @author husi
 * @since 11/20/2020
 */

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;
import java.util.stream.IntStream;
import org.junit.Test;

/**
 *@ClassName ParallelStreamTest
 *@Description TODO
 *@Date 11/20/2020 11:14 AM
 *@Version 1.0
 **/
public class ParallelStreamTest {

  class Item {
    private  Integer id;

    public void setId(Integer id) {
      this.id = id;
    }

    public Integer getId() {
      return id;
    }
  }

  @Test
  public void test() throws InterruptedException {
    List<Item> input = new ArrayList<>();
    List<Integer> integers = new ArrayList<>();
    IntStream.range(0,1000).forEach(integers::add);
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4,100,120, TimeUnit.MINUTES,new LinkedBlockingDeque<>());

    IntStream.range(0,1000).forEach(i -> {
      Optional<Item> optional = input.parallelStream().filter(item -> (item.getId().equals(i))).findAny();
      threadPoolExecutor.submit(new Runnable() {
        @Override
        public void run() {
          assertTrue(optional.get().getId().equals(i));
        }
      });

    });

    while(true){
      if(threadPoolExecutor.getActiveCount() == 0){
        System.out.println("All done");
        threadPoolExecutor.shutdown();
        break;
      }
      Thread.sleep(1000);
      System.out.print("...");
    }
  }

}
