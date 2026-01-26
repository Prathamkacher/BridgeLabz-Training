package com.annotationsandreflection.annotations.maxlengthannotation;

class User {

    @MaxLength(10)
    private String username;

    public User(String username) {

        try {
            // get field using reflection
            var field = this.getClass().getDeclaredField("username");

            if (field.isAnnotationPresent(MaxLength.class)) {

                MaxLength max = field.getAnnotation(MaxLength.class);

                if (username.length() > max.value()) {
                    throw new IllegalArgumentException(
                        "Username length exceeds " + max.value()
                    );
                }
            }

            this.username = username;

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUsername() {
        return username;
    }
}
