package com.mgu.java.java10;

import java.util.ArrayList;
import java.util.List;

/*
keyword var can now be used to declare local variables
<ul>
<li>name of var must be representative</li>
<li>init of var should give enough information</li>
<li>beware of diamonds and generics</li>
</ul>
 */
public class VarSample {
    void sample() {
        List<String> list = new ArrayList<>(); // old style
        var listOfString = new ArrayList<String>();
        var list3 = new ArrayList<>(); // pas bon car on parle de quoi
    }
}
