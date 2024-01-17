package com.blog.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;




@Entity
@Table(name="posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private long id;
     private String title;
     private String description;
     private String content;

     @OneToMany(mappedBy = "post",cascade =CascadeType.ALL)

     private List<Comment>comments=new ArrayList<>();



}
