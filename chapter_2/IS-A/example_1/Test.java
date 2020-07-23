/*
Compilar dentro do diretorio example_1: javac -cp ../ Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {
        Subaru s = new Subaru();
        System.out.println(String.format("Is Subaru a Car? %s", s instanceof Car));
        System.out.println(String.format("Is Subaru a Vehicle? %s", s instanceof Vehicle));

        /*
                            ===============================
                            ==          Vehicle          ==
                            ===============================

                                            ^
                                            |
                                          IS-A
                                            |

                            ===============================
                            ==            Car            ==
                            ===============================

                                            ^
                                            |
                                          IS-A
                                            |

                            ===============================
                            ==           Subaru          ==
                            ===============================

    
            A Car is a Vehicle;
            A Subaru is a Car;
        */
    }
}