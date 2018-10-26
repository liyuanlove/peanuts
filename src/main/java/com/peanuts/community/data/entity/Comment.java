package com.peanuts.community.data.entity;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity(name="comment")
@EqualsAndHashCode(callSuper=false)
public class Comment {

}
