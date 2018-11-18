package org.sang.mapper;

import org.apache.ibatis.annotations.Param;
import org.sang.bean.Menu;

import java.util.List;

/**
 * Created by sang on 2017/12/28.
 */
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);

    List<Menu> selectMenuByPage(@Param("start")  int start , @Param("size") int size,@Param("name") String name);


}
