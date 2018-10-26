package com.peanuts.community.data.entity;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity(name="article")
@EqualsAndHashCode(callSuper=false)
public class Tag {

}
