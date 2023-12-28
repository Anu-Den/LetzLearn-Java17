package com.letzlearn.java17.sealed;


public sealed interface Shape permits Circle, Rectangle,Square{
    void findArea();
}
