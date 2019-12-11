package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
@Document(collection = "Admin_User")
public class Admin {
    @Id
    private String id;
    private String admin_username;
    private String admin_password;

    public Admin(String id, String username, String password) {
        this.id= id;
        this.admin_username = username;
        this.admin_password = password;
    }


    public String getId() {
        return id;
    }

    public String getAdmin_username() {
        return admin_username;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setId(String id) {
        this.id = id;
    }

}
