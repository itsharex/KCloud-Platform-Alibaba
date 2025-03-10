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

package org.laokou.admin.convertor;

import org.laokou.admin.domain.message.Message;
import org.laokou.admin.dto.message.clientobject.MessageCO;
import org.laokou.admin.gatewayimpl.database.dataobject.MessageDO;
import org.laokou.common.core.utils.ConvertUtil;

/**
 * @author laokou
 */
public class MessageConvertor {

	public static Message toEntity(MessageCO messageCO) {
		return ConvertUtil.sourceToTarget(messageCO, Message.class);
	}

	public static MessageDO toDataObject(Message message) {
		return ConvertUtil.sourceToTarget(message, MessageDO.class);
	}

}
