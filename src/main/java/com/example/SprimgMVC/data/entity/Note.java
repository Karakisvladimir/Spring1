package com.example.SprimgMVC.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note {
    private UUID id;
    private String title;
    private String content;
}
