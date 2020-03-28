package com.atlantong.gmall.user.service;

import com.atlantong.gmall.user.bean.UmsMember;
import com.atlantong.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceviceAddressByMemberId(Long memberId);
}
