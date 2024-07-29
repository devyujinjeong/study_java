package threadTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
   public static void main(String[] args) {
      Runnable animal = () -> {
         for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {Thread.sleep(1000);} catch (InterruptedException e) {;}
         }
      };
      
      ArrayList<Thread> animals = new ArrayList<Thread>();
      ArrayList<String> sounds = new ArrayList<String>(Arrays.asList("¾îÈï!", "²Ð²Ð!", "²Ü²Ü!"));
      sounds.stream().map(sound -> new Thread(animal, sound)).forEach(animals::add);
      
      for(int i=0; i<animals.size(); i++) {
         animals.get(i).start();
         if(i != 0) {
            try {animals.get(i).join();} catch (InterruptedException e) {;}
         }
      }      
   }
}

