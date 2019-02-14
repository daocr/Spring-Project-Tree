package cn.yueshutong.springprojecttree.db.service;

import cn.yueshutong.springprojecttree.db.entity.MethodNode;

import java.util.List;

/**
 * Create by yster@foxmail.com 2019/2/1 0001 15:35
 */
public interface MethodNodeService {

    boolean saveNotRedo(MethodNode node);

    List<MethodNode> findAll();

    MethodNode findAllById(Long id);
}
