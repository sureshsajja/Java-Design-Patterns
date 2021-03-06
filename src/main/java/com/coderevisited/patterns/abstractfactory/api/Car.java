/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015  CodeRevisited.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.coderevisited.patterns.abstractfactory.api;

import com.coderevisited.patterns.abstractfactory.impl.Engine;
import com.coderevisited.patterns.abstractfactory.impl.Exterior;
import com.coderevisited.patterns.abstractfactory.impl.Interior;
import com.coderevisited.patterns.abstractfactory.impl.Tyre;

/**
 * User :  Suresh
 * Date :  06/08/15
 * Version : v1
 */
public abstract class Car {

    protected String name;
    protected Tyre tyre;
    protected Engine engine;
    protected Interior interior;
    protected Exterior exterior;


    public void setName(String name) {
        this.name = name;
    }

    public void assemble() {
        System.out.println("Assembling Car for continues for 4 hours");
        doAssemble();
    }

    protected abstract void doAssemble();

    public void pdc() {
        System.out.println("PDC is taking place for 2 hours");
    }

    public void clean() {
        System.out.println("Cleaning in progress for 30 min");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------- " + name + " ------\n");
        sb.append(tyre);
        sb.append("\n");
        sb.append(engine);
        sb.append("\n");
        sb.append(interior);
        sb.append("\n");
        sb.append(exterior);
        sb.append("\n");

        return sb.toString();

    }
}
