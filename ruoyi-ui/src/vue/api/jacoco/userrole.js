import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listUserrole(query) {
  return request({
    url: '/jacoco/userrole/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getUserrole(id) {
  return request({
    url: '/jacoco/userrole/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addUserrole(data) {
  return request({
    url: '/jacoco/userrole',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateUserrole(data) {
  return request({
    url: '/jacoco/userrole',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delUserrole(id) {
  return request({
    url: '/jacoco/userrole/' + id,
    method: 'delete'
  })
}

// 导出【请填写功能名称】
export function exportUserrole(query) {
  return request({
    url: '/jacoco/userrole/export',
    method: 'get',
    params: query
  })
}