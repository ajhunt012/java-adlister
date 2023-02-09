package controllers;

import org.mindrot.jbcrypt.BCrypt;

public class HashTest {
    public static void main(String[] args) {

//        String password = "password123";
//        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
//        System.out.println(hash);
//// Output: $2a$10$TbjLzPRB1MBIQAQbFsmANOumLP0oOEU1b.MvZFkeqIG0D8RqzFbIq
////Actual : $2a$10$bIuT/hYruucYsePXByOqnuuRV/sdRDd8nZkcuc7oqrZM5wMCWjkQS


//        String password = "password123";
//        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
//        System.out.println(hash);
//// Output: $2a$10$Xb8.QOh8AWXVA3M66vUBJOoRoWAXvMdYEZC20p0AM7/3dde/usU6m
//// Actual: $2a$10$wi2KGRGfjPu7BAQgdZte0egz7Mj7vBsRdbVq2wdrqH3EvC/qVGWvC
//        hash = BCrypt.hashpw(password, BCrypt.gensalt());
//        System.out.println(hash);
//// Output: $2a$10$E6boHsNAQ6Iz3xEQCNtiLObPF8d2W6SPqh8ik1da4ASmqySgvghpK
//// Actual: $2a$10$W9Bw6XZ1.0yOaWlWmXiEyemiCy1ipKgXqv0Sot9QI9LBpg6I3QNoy

        String password = "password123";
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());

        boolean passwordsMatch = BCrypt.checkpw("mypassword", hash);
        System.out.println(passwordsMatch); // false
        //Actual: false

        passwordsMatch = BCrypt.checkpw("password123", hash);
        System.out.println(passwordsMatch); // true
        // Actual: true


    }
}
