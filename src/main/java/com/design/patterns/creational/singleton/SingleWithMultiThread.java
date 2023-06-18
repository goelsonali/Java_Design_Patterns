package com.design.patterns.creational.singleton;

import java.util.concurrent.atomic.AtomicReference;

public class SingleWithMultiThread {

    //The volatile keyword can be used on the FIELD variable declaration ONLY - no class, no parameters, no methods no local var
    //VISIBILITY : Changes done by 1 thread visible to other threads.
    //MUTUAL EXCLUSION : Only 1 thread can execute a BLOCK of code and can do update to the shared data.
    //MOST IMPORTANT CONCEPT : Volatile variables are NEVER CACHED, so always read from the MAIN MEMORY.
    private static volatile SingleWithMultiThread instance;
    private String data;

    SingleWithMultiThread(String data) {
        this.data = data;
    }

    public String getData(){
        return this.data;
    }

    public static SingleWithMultiThread getInstance(String data) {

        SingleWithMultiThread result = instance;
        if(result == null) { // This check prevents the other threads WAIT time.
            //To provide VISIBILITY and MUTUAL EXCLUSION together , and prevents the threads to update the volatile var at the same time, "synchronized" keyword is used.
            synchronized (SingleWithMultiThread.class) { // ONLY with this block ( without null check above), every time a new thread tries to access the code has to wait which is unnecessary.
                //This also tells compiler to allow only 1 thread to enter the block and all variables create inside the block should be FLUSHED from cache and get data from MAIN MEMORY.
                result = instance;
                if(result == null ) {
                    instance = result = new SingleWithMultiThread(data);
                }
            }
        }

        return result;
    }

    //If only read operation needs to be wrapped use only VOLATILE , but if need both read and write use synchronized block
    //Synchronized block can be defined inside a block or can be used as a keyword with method definition
    //So to use both read and write operation only on 1 data field we can use ATOMIC keyword, that do exactly same as VOLATILE + synchronized on 1 data field.

}
