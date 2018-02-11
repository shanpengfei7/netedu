package com.bigdata.dao;

import java.util.List;

import com.bigdata.action.dataanalysisbase.MultiSourceData;
import com.bigdata.entity.onesavetable.AllDatum;
import com.bigdata.entity.subscriber.Subscriber;

/**
 * DAO�Ľӿڣ����ڲ������ݿ�
 * 
 * @author ������
 *
 */
public interface ServiceDao {
	/**
	 * ͨ���ֻ�����õ�һ���û�
	 * 
	 * @param username
	 * @return ����
	 */
	public Subscriber getSubscriberByNumber(String number);

	/**
	 * ��һ������һ����¼�����������ݿ���
	 * 
	 * @param entity
	 */
	public void save(Object entity);

	/**
	 * ͨ��ʵ��������ֺ��ֶΣ������ļ�Ŀ¼�����õ�ĳһ����ص�����
	 * 
	 * @param clazz
	 * @param menu
	 * @param extension
	 * @return list����
	 */
	public <T> List<T> getList(String clazz, String menu, String extension);

	/**
	 * ͨ��ʵ��������ֺ��ֶΣ�����Ŀ¼�����õ�ĳһ����ص����ݣ� ��Ҫ������ݷ��������¶�Դ������һ���
	 * 
	 * @param clazz
	 * @param menu
	 * @return
	 */
	public List<MultiSourceData> getDataList(String menu);

	/**
	 * ɾ�����ݿ��е�һ����¼
	 * 
	 * @param entity
	 */
	public void delete(Object entity);

	/**
	 * ͨ��������idɾ�����ݿ��е�һ����¼
	 * 
	 * @param tablename
	 * @param id
	 */
	public void deleteByQuery(String tablename, int id);

	/**
	 * ͨ��ʵ��������ֺ�id�õ�һ������
	 * 
	 * @param id
	 * @return
	 */
	public Object getObjectById(String clazz, int id);

	/**
	 * ͨ��sql����һ������һ����¼�����������ݿ���
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
	 * ������Ϣ������ģ����ѯ
	 * 
	 * @param putin
	 * @return
	 */
	public List<AllDatum> getSearchDatum(String putin);

	/**
	 * ͨ�������õ����е�ע���û�
	 * 
	 * @return
	 */
	public List<Subscriber> getAllSubscriber();

	/**
	 * ͨ�����������ϵ����ֵõ����ϵĶ��������ϴ��ϲ�ѯ�������Ƿ����ϴ�
	 * 
	 * @param tablename
	 * @param name
	 * @return
	 */
	public List<?> getObjectByname(String tablename, String name);
	

}
