package com.smallcc.service;

import java.util.List;
import java.util.Map;

import com.smallcc.model.Links;
import com.smallcc.model.RResource;

public interface LinksService {

	int deleteByPrimaryKey(Integer id);

    int insert(Links record);

    int insertSelective(Links record);
    
    int selectNoApplyLinksCount();
    
    Links selectByPrimaryKeyAdmin(Integer id);
    
    Links selectByPrimaryKey(Integer id);
    
    List<Links> selectAllLinks();
    /**
     * 模糊查询
     * @param map
     * @return
     */
    List<Links> selectLikeLinksListByPage(Map<String, Object> map);
    
    /**
 	 *  获取友链信息，根据状态分组查询
 	 * @return
 	 */
 	List<?>  selectLinksListByStatus();
    
    int updateByPrimaryKeySelective(Links record);

    int updateByPrimaryKey(Links record);
}
