package com.wen.smark.serviceimpl;

import com.wen.smark.service.BaseService;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by wen_toto on 2017/8/24.
 */

public class BaseImpService<T, K> implements BaseService<T, K> {

    /**
     * 定义一个泛型变量并初始化为null
     */
    private T tClass = null;

    /**
     * 定义一个Class类类型对象并初始化为null
     */
    private Class<?> aClass= null;

    /**
     * @Title: getBaseServiceClass
     * @Description: 该方法用来获取范型的class对象，以便通过反射机制提供的newInstance()方法来构造该泛型的
     * 实例对象。其中getGenericSuperclass()方法为获取当前类的属性如：com.wen.smark.serviceimpl.BaseImpService<Customer,Long>
     * 需要注意的是，需用继承了BaseService接口的业务接口的实例来调用该方法才能够获取到相应的泛型class，否则不能获取，原因是因为在业务接口
     * 继承了BaseService接口后，BaseService接口中的泛型会被实际指定为我们所需要的泛型。从而可以获取其泛型的class。否则会获取不到。
     * @return Class
     */
    public Class<?> getBaseServiceClass(){

        Type type = getClass().getGenericSuperclass();
        if(type instanceof ParameterizedType){
            Type[] params = ((ParameterizedType) type).getActualTypeArguments();
            return (Class<?>) params[0];
        }else {
            System.out.println("Object.class");
            return Object.class;
        }

    }

    /**
     * @Title: saveEntity
     * @Description: 保存并且返回保存的数据
     * @author wen_toto
     * @date 2017/8/24
     * @param entity 保存的数据对象
     * @return T
     */
    @Override
    public T saveEntity(T entity) {
        System.out.println(entity.getClass());
        getBaseServiceClass();
        return null;
    }

    /**
     * @Title: saveEntityBytList
     * @Description: 保存并且返回保存的数据集
     * @author wen_toto
     * @date 2017/8/24
     * @param tList 需保存的数据对象集合
     * @return List
     */
    @Override
    public List<T> saveEntityBytList(List<T> tList) {
        return null;
    }

    /**
     * @Title: getEntityById
     * @Description: 通过传入的关键字来获取实体信息
     * @author wen_toto
     * @date 2017/8/24
     * @param key 查找关键字
     * @return T
     */
    @Override
    public T getEntityById(K key) {
        return null;
    }

    /**
     * @Title: getEntityListByIds
     * @Description: 通过传入的关键字集来查找我们所需要的数据，并返回相应的数据集
     * @author wen_toto
     * @date 2017/8/24
     * @param keys 传入的关键字集合
     * @return List
     */
    @Override
    public List<T> getEntityListByIds(List<K> keys) {
        return null;
    }

    /**
     * @Title: deleteEntityById
     * @Description: 通过传入的数据id，来删除数据库中该id所标识的唯一记录，然后返回已被删除的数据信息
     * @author wen_toto
     * @date 2017/8/24
     * @param id id字段值
     * @return T
     */
    @Override
    public T deleteEntityById(K id) {
        return null;
    }

    /**
     * @Title: deleteEntityByIds
     * @Description: 删除传入的id集合所对应的记录,并返回已删除的数据信息集合
     * @author wen_toto
     * @date 2017/8/24
     * @param ids id集合
     * @return List
     */
    @Override
    public List<T> deleteEntityByIds(List<K> ids) {
        return null;
    }

    /**
     * @Title: upDataEntity
     * @Description: 更新数据操作,并且返回已修改的数据信息
     * @author wen_toto
     * @date 2017/8/24
     * @param entity 需修改的数据
     * @return T
     */
    @Override
    public T upDataEntity(T entity) {
        return null;
    }

    /**
     * @Title: upDataEntityByEntityList
     * @Description: 更新数据集操作，并且返回已修改的数据集信息
     * @author wen_toto
     * @date 2017/8/24
     * @param entityList 传入的新信息集
     * @return List
     */
    @Override
    public List<T> upDataEntityByEntityList(List<T> entityList) {
        return null;
    }
}
