package com.bigdata.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.bigdata.action.dataanalysisbase.MultiSourceData;
import com.bigdata.dao.ServiceDao;
import com.bigdata.entity.onesavetable.AllDatum;
import com.bigdata.entity.subscriber.Subscriber;

/**
 * DAO接口的实现
 * 
 * @author 单鹏飞
 *
 */
@Component
public class ServiceDaoImpl implements ServiceDao {

	private HibernateTemplate hibernateTemplate;
	private Subscriber subscriber;

	public Subscriber getSubscriber() {
		return subscriber;
	}

	@Resource
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public Subscriber getSubscriberByNumber(String number) {

		String hql = "from Subscriber where number ='" + number + "'";
		@SuppressWarnings("unchecked")
		List<Subscriber> list = hibernateTemplate.find(hql);
		if (list.size() > 0) {
			subscriber = list.get(0);
			return subscriber;
		}
		return null;
	}

	@Override
	public void save(Object entity) {

		hibernateTemplate.save(entity);
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List getList(String clazz, String menu, String extension) {

		String hql = "from " + clazz + " where menu='" + menu
				+ "'and extension='" + extension + "'";
		List list = hibernateTemplate.find(hql);
		return list;
	}

	@Override
	public void delete(Object entity) {

		hibernateTemplate.delete(entity);
	}

	@Override
	public Object getObjectById(String clazz, int id) {

		return hibernateTemplate.get(clazz, id);
	}

	@Override
	public void saveByQuery(final String tablename, final String createtime,
			final String extension, final String menu, final String name,
			final String path, final String uploader) {

		hibernateTemplate.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session arg0)
					throws HibernateException, SQLException {

				String sql = "insert into "
						+ tablename
						+ "(createtime,extension,menu,name,path,uploader)value(?,?,?,?,?,?)";

				int i = arg0.createSQLQuery(sql).setString(0, createtime)
						.setString(1, extension).setString(2, menu)
						.setString(3, name).setString(4, path)
						.setString(5, uploader).executeUpdate();
				return i;
			}
		});
	}

	@Override
	public void deleteByQuery(final String tablename, final int id) {

		hibernateTemplate.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session arg0)
					throws HibernateException, SQLException {

				String sql = "delete from " + tablename + " where id =?";
				int j = arg0.createSQLQuery(sql).setInteger(0, id)
						.executeUpdate();
				return j;
			}
		});
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AllDatum> getSearchDatum(String putin) {

		String hql = "from AllDatum where firstmenu like '%" + putin
				+ "%' or secondmenu like '%" + putin
				+ "%' or thirdmenu like '%" + putin
				+ "%' or fourthmenu like '%" + putin + "%' or name like '%"
				+ putin + "%' or path like '%" + putin
				+ "%' or createtime like '%" + putin + "%' or uploader like '%"
				+ putin + "%'";

		return hibernateTemplate.find(hql);
	}

	@Override
	public List<MultiSourceData> getDataList(String menu) {
		String hql = "from MultiSourceData where menu='" + menu + "'";
		@SuppressWarnings("unchecked")
		List<MultiSourceData> list = hibernateTemplate.find(hql);
		return list;
	}

	@Override
	public List<Subscriber> getAllSubscriber() {

		String hql = "from Subscriber";
		@SuppressWarnings("unchecked")
		List<Subscriber> list = hibernateTemplate.find(hql);
		return list;
	}

	@Override
	public List<?> getObjectByname(final String tablename, final String name) {

		List<?> list = (List<?>) hibernateTemplate.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session arg0)
					throws HibernateException, SQLException {
				String sql = "select * from " + tablename + " where name =?";
				List<?> list = arg0.createSQLQuery(sql).setString(0, name).list();
				return list;
			}
		});
		return list;
	}

}
