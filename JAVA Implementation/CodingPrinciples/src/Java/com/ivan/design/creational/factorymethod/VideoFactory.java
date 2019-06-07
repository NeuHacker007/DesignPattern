package com.ivan.design.creational.factorymethod;

public abstract class VideoFactory {
    /*
    *  Here we can use interface to define this video factory if there is no any known implementation like properties,
    *  concrete method etc. But in most cased, the video factory has some knowledge about implementations so, in this case
    *  we use abstract class instead.
    * */
    public abstract Video GetVideo();
}
