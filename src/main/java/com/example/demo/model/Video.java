package com.example.demo.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.InputStream;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "video")
public class Video {

    private String title;
    private InputStream stream;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public InputStream getStream() {
        return stream;
    }

    public void setStream(InputStream stream) {
        this.stream = stream;
    }
}
