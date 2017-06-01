package yjc.demo.dao;

import org.apache.ibatis.annotations.Param;
import yjc.demo.entities.User;
import yjc.framework.orm.db.Pager;

import java.util.List;

/**
 * Created by yangjiachang on 2016/7/21.
 */
public interface UserDao {

    int insert(User user);

    int batchInsert(@Param("list") List<User> list);

    List<User> query(@Param("pager")Pager pager , @Param("user")User user);
}
