package com.wen.smark.service;

import java.util.List;

/**
 * Created by wen_toto on 2017/8/23.
 */
public interface BaseService<T, K> {

    /**
     * @Title: saveEntity
     * @Description: 保存并且返回保存的数据
     * @author wen_toto
     * @date 2017/8/24
     * @param entity 保存的数据对象
     * @return T
     */
    public T saveEntity(T entity);

    /**
     * @Title: saveEntityBytList
     * @Description: 保存并且返回保存的数据集
     * @author wen_toto
     * @date 2017/8/24
     * @param tList 需保存的数据对象集合
     * @return List
     */
    public List<T> saveEntityBytList(List<T> tList);

    /**
     * @Title: getEntityById
     * @Description: 通过传入的关键字来获取实体信息
     * @author wen_toto
     * @date 2017/8/24
     * @param key 查找关键字
     * @return T
     */
    public T getEntityById(K key);

    /**
     * @Title: getEntityListByIds
     * @Description: 通过传入的关键字集来查找我们所需要的数据，并返回相应的数据集
     * @author wen_toto
     * @date 2017/8/24
     * @param keys 传入的关键字集合
     * @return List
     */
    public List<T> getEntityListByIds(List<K> keys);

    /**
     * @Title: deleteEntityById
     * @Description: 通过传入的数据id，来删除数据库中该id所标识的唯一记录，然后返回已被删除的数据信息
     * @author wen_toto
     * @date 2017/8/24
     * @param id id字段值
     * @return T
     */
    public T deleteEntityById(K id);

    /**
     * @Title: deleteEntityByIds
     * @Description: 删除传入的id集合所对应的记录,并返回已删除的数据信息集合
     * @author wen_toto
     * @date 2017/8/24
     * @param ids id集合
     * @return List
     */
    public List<T> deleteEntityByIds(List<K> ids);

    /**
     * @Title: upDataEntity
     * @Description: 更新数据操作,并且返回已修改的数据信息
     * @author wen_toto
     * @date 2017/8/24
     * @param entity 需修改的数据
     * @return T
     */
    public T upDataEntity(T entity);

    /**
     * @Title: upDataEntityByEntityList
     * @Description: 更新数据集操作，并且返回已修改的数据集信息
     * @author wen_toto
     * @date 2017/8/24
     * @param entityList 传入的新信息集
     * @return List
     */
    public List<T> upDataEntityByEntityList(List<T> entityList);

}
