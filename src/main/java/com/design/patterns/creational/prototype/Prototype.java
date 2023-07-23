package com.design.patterns.creational.prototype;

//The Prototype pattern delegates the cloning process to the actual objects that are being cloned.
// The pattern declares a common interface for all objects that support cloning.
// This interface lets you clone an object without coupling your code to the class of that object.
// Usually, such an interface contains just a single clone method.
public interface Prototype {
    Dress clone();
}
