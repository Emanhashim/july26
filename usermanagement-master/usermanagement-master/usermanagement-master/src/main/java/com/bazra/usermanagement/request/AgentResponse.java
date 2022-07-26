package com.bazra.usermanagement.request;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.bazra.usermanagement.model.AgentInfo;
import com.bazra.usermanagement.model.UserInfo;

public class AgentResponse {
	private Integer id;

	private String username;
	private String roles;
	 private Optional<AgentInfo> agentInfos;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	public AgentResponse(Optional<AgentInfo> agentInfos) {
		super();
		this.id = agentInfos.get().getId();
		this.username = agentInfos.get().getUsername();
		this.roles = agentInfos.get().getRoles();
	}

}
