package Generics;

import java.util.Scanner;

public class ScopeExample {
       private int scope;

        public ScopeExample(Scanner scope) {
            System.out.println("Please enter a number: ");
            this.scope = scope.nextInt();
        }

        public void x() {
            for(int x = 1; x < 13; x++) {
                System.out.println(x + " times " + this.scope + " equals " + x * this.scope);
            }
        }
    }
