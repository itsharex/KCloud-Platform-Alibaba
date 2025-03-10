/*
 * Copyright (c) 2022 KCloud-Platform-Alibaba Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.laokou.auth.gatewayimpl.database.dataobject;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;

/**
 * @author laokou
 */
@Data
public class UserDO implements Serializable {

	@Serial
	private static final long serialVersionUID = 3319752558160144611L;

	@Schema
	private Long id;

	private String username;

	private String avatar;

	private Integer superAdmin;

	private Integer status;

	private String mail;

	private String mobile;

	private String password;

	private Long deptId;

	private String deptPath;

	private Long tenantId;

}
