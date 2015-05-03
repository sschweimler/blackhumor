package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Galery extends Model {

@Id
public long galeryId;

public String name;
public String description;

public Galery(String name, String description){

	this.name = name;
	this.description = description;
	
}
	
	
	
}
