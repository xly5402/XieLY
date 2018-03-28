package com.xly.qian.demo.mapper;

import com.xly.qian.demo.entity.User;
import com.xly.qian.demo.query.UserQuery;

import java.util.List;

public interface UserMapper {

    /** <p>Title: </p>
     * @Author: XieLY
     * @Description:查询所有用户
     * @Date: 2018/3/28 15:33
     * @version 1.0
     * @Modifiey By:
     *
     */

    List<User> queryAllUser(User user);

    /** <p>Title: </p>
     * @Author: XieLY
     * @Description:根据查询条件查询用户
     * @Date: 2018/3/28 15:35
     * @version 1.0
     * @Modifiey By:
     *
     */


    List<User> queryAllUserByQuery(UserQuery userQuery);

    Integer doCreateUser(User user);

    Integer doModifyUserById(User user);

    Integer doDeleteUserById(User user);
}
