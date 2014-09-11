package com.furniture.persistence.dao;

import com.furniture.persistence.model.Actor;

public interface ActorMapper {
    
    Actor selectByPrimaryKey(Short actorId);
    
}