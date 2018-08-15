<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="header.jsp"%>
<div id="regLogin" class="wrap">
		<div class="dialog">
			<dl class="clearfix">
				<dt>新房屋信息发布</dt>
				<dd class="past">更改房屋信息</dd>

			</dl>
			<div class="box">
				<form id="House_add_action" name="House_add_action" action="user/house_doUpdate.action" method="post">
					<input type="hidden" name="id"  value="${house.id }"/>
					
					<div class="infos">
						<table class="field">
							<tr>
								<td class="field">标 题：</td>
								<td><input type="text" name="title" value="${house.title }"
									id="House_add_action_title" class="text" /></td>
							</tr>
							<tr>
								<td class="field">户 型：</td>
								<td><select class="text" name="type_id" id="houseType">
	                                   
										<c:forEach items="${houseTypeList }" var="houseType">
										<c:if test="${houseType.id==house.id }">
										<option value="${house.id }" selected>${house.name }</option>
										</c:if>
										<c:if test="${houseType.id!=house.id }">
										<option value="${houseType.id }">${houseType.name }</option>
										</c:if>	

										</c:forEach>
								</select></td>
							</tr>
							<tr>
								<td class="field">面 积：</td>
								<td><input type="text" name="floorage" value="${house.floorage }"
									id="House_add_action_floorage" class="text" /></td>
							</tr>
							<tr>
								<td class="field">价 格：</td>
								<td><input type="text" name="price" value="${house.price }"
									id="House_add_action_price" class="text" /></td>
							</tr>
							<tr>
								<td class="field">房产证日期：</td>
								<td><input type="text" class="text" name="pubDate" value="${ house.pubDate}"></td>
							</tr>
							<tr>
								<td class="field">位 置：</td>
								<td>区：<select class="text" name="district.id"
									id="houseDistrict" onchange="onchangeDistrict(this.value)">

										<c:forEach items="${districtList }" var="district">
											<option value="${district.id }">${district.name }</option>

										</c:forEach>

								</select> 街：<select class="text" name="street.id" id="houseStreet">


								</select>
								</td>
							</tr>
							<tr>
								<td class="field">联系方式：</td>
								<td><input type="text" name="contact" value="${house.contact }"
									id="House_add_action_contact" class="text" /></td>
							</tr>
							<tr>
								<td class="field">详细信息：</td>
								<td><textarea name="description"> ${house. description}</textarea> <!-- <textarea class="ckeditor" name="description"></textarea> -->
								</td>
							</tr>
						</table>
						<div class="buttons">
							<input type="submit" id="House_add_action_0" value="立即发布"
								 />
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>