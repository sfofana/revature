package com.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table
public class SuperBeing implements Serializable{

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int superBeingId;
	private String firstName;
	private String lastName;
	private int strength;
	private int constitution;
	private int agility;
	private int intelligence;
	private String abilities;
//	@OneToOne
//	private User user;
//	@OneToOne
//	private Alignment alignment;
//	@OneToOne
	private Team team;
	
	
	
}
