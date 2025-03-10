/*
 * Copyright (c) 2022 KCloud-Platform-Alibaba Authors. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.laokou.admin.gatewayimpl.database;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.laokou.admin.gatewayimpl.database.dataobject.RoleDO;
import org.laokou.common.mybatisplus.database.BatchMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.laokou.common.i18n.dto.PageQuery.SQL_FILTER;
import static org.laokou.common.mybatisplus.database.dataobject.BaseDO.TENANT_ID;

/**
 * @author laokou
 */
@Repository
@Mapper
public interface RoleMapper extends BatchMapper<RoleDO> {

	IPage<RoleDO> getRoleListByTenantIdAndLikeNameFilter(IPage<RoleDO> page, @Param(TENANT_ID) Long tenantId,
			@Param("name") String name, @Param(SQL_FILTER) String sqlFilter);

	List<Long> getRoleIdsByTenantId(@Param(TENANT_ID) Long tenantId);

}
