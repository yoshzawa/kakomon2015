package com.gmail.yoshzawa.AzureOpenId.ofy;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.Date;
import java.util.List;

import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class UserAccount {
	@Id
	private Long id;
	private String email;
	public Date created;
	public Date modified;

	
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public UserAccount(String email){
		setEmail(email);
		setCreated(new Date());
	}
	
	public static void ofyInit(){
		ObjectifyService.register(UserAccount.class);
	}
	public List<UserAccount> getList(){
	    return ofy().load().type(UserAccount.class).list();
	}
	public void save(){
		setModified(new Date());
		ofy().save().entity(this).now();
	}
	
	

}
