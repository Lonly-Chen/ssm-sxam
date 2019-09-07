package com.qf.ssmexam.dao;

import com.qf.ssmexam.pojo.User;
import tk.mybatis.mapper.common.*;

public interface UserDao  extends MySqlMapper<User>,
        ExampleMapper<User>, BaseMapper<User>, IdsMapper<User>, ConditionMapper<User> {
}
