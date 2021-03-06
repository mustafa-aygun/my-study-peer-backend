package com.mystudypeer.mystudypeer.domains;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class PostTagId implements Serializable {
    private int postId;
    private String tag;
}