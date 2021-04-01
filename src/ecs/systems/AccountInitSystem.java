package ecs.systems;

import ecs.components.AccountComponent;
import ecs.systems.ISystemECS;

import java.util.ArrayList;

/**
 * @author Sebastian Norén <s.norén@gmail.com>
 */
public class AccountInitSystem implements ISystemECS {

    public void process(ArrayList<AccountComponent> list) {


        long startTime = System.nanoTime();

        for (AccountComponent accountComponent : list) {
            accountComponent.amount = 100;
        }

        long endTime = System.nanoTime();

        // get difference of two nanoTime values
        long timeElapsed = endTime - startTime;

        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
        System.out.println("Execution time in milliseconds : " + timeElapsed / 1000000);

    }
}
