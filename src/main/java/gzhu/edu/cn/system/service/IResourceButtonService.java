package gzhu.edu.cn.system.service;

import java.util.Set;

import gzhu.edu.cn.base.service.BaseService;
import gzhu.edu.cn.system.entity.Resource;
import gzhu.edu.cn.system.entity.ResourceButton;
import gzhu.edu.cn.system.entity.User;



/**
 * 资源按钮操作管理
 * <p>Title : IResourceService</p>
 * <p>Description : </p>
 * <p>Company : </p>
 * @author 丁国柱
 * @date 2017年11月26日 上午1:52:38
 */
public interface IResourceButtonService extends BaseService<ResourceButton, Long>{
	
	/**
	 * 根据当前用户与资源获取资源的操作按钮
	 * <p>方法名:getResourceButtonByUserId </p>
	 * <p>Description : </p>
	 * <p>Company : </p>
	 * @author 丁国柱
	 * @date 2018年1月31日 上午1:39:45
	 * @param resource
	 * @param user
	 * @return
	 */
	public Set<ResourceButton> getResourceButtonByUserId(Resource resource,User user);
	
}
