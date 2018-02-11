package com.bigdata.dao;

import java.util.List;

import com.bigdata.action.dataanalysisbase.MultiSourceData;
import com.bigdata.entity.onesavetable.AllDatum;
import com.bigdata.entity.subscriber.Subscriber;

/**
 * DAO的接口，用于操作数据库
 * 
 * @author 单鹏飞
 *
 */
public interface ServiceDao {
	/**
	 * 通过手机号码得到一个用户
	 * 
	 * @param username
	 * @return 密码
	 */
	public Subscriber getSubscriberByNumber(String number);

	/**
	 * 把一个对象（一条记录）保存在数据库中
	 * 
	 * @param entity
	 */
	public void save(Object entity);

	/**
	 * 通过实体类的名字和字段（三、四级目录）名拿到某一块相关的内容
	 * 
	 * @param clazz
	 * @param menu
	 * @param extension
	 * @return list集合
	 */
	public <T> List<T> getList(String clazz, String menu, String extension);

	/**
	 * 通过实体类的名字和字段（三级目录）名拿到某一块相关的内容； 主要针对数据分析基础下多源数据这一块儿
	 * 
	 * @param clazz
	 * @param menu
	 * @return
	 */
	public List<MultiSourceData> getDataList(String menu);

	/**
	 * 删除数据库中的一条记录
	 * 
	 * @param entity
	 */
	public void delete(Object entity);

	/**
	 * 通过表名和id删除数据库中的一条记录
	 * 
	 * @param tablename
	 * @param id
	 */
	public void deleteByQuery(String tablename, int id);

	/**
	 * 通过实体类的名字和id拿到一个对象
	 * 
	 * @param id
	 * @return
	 */
	public Object getObjectById(String clazz, int id);

	/**
	 * 通过sql语句把一个对象（一条记录）保存在数据库中
	 * 
	 * @param tablename
	 * @param createtime
	 * @param extension
	 * @param menu
	 * @param name
	 * @param path
	 * @param uploader
	 */
	public void saveByQuery(String tablename, String createtime,
			String extension, String menu, String name, String path,
			String uploader);

	/**
	 * 输入信息，进行模糊查询
	 * 
	 * @param putin
	 * @return
	 */
	public List<AllDatum> getSearchDatum(String putin);

	/**
	 * 通过组名拿到所有的注册用户
	 * 
	 * @return
	 */
	public List<Subscriber> getAllSubscriber();

	/**
	 * 通过表名和资料的名字得到资料的对象，用于上传上查询该资料是否已上传
	 * 
	 * @param tablename
	 * @param name
	 * @return
	 */
	public List<?> getObjectByname(String tablename, String name);
	

}
