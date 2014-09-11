package com.furniture.persistence.dao;

import java.util.List;

import com.furniture.persistence.model.Picture;

public interface PictureMapper {

    Picture selectByPrimaryKey(Integer pictureId);
    
    List<Picture> selectPictureByTypeCode(String pictureTypeCode);

}