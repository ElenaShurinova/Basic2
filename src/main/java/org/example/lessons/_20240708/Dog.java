package org.example.lessons._20240708;



        public class Dog {
            private String name;
            private int age;

            public Dog(String name, int age) throws Exception {
                this.name = name;
                if (age < 0 || age > 15) {
                    throw new Exception("Incorrect age");
                }
                this.age = age;
            }

            public void run() {
                System.out.println("Dog is running...");
            }
        }
