package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;

@Entity
public class GaleryPicture extends Model {

@Id
public long galeryPicureId;
public String image;
public String description;
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "galery")
public Galery galery;
	
public GaleryPicture(Galery galery, String image, String descr){
	
	this.galery= galery;
	this.image = image;
	this.description = descr;
}
}
