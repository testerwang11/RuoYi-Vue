import request from '@/utils/request'

// 查询jacoco项目列表
export function listProject(query) {
  return request({
    url: '/jacoco/project/list',
    method: 'get',
    params: query
  })
}

// 查询jacoco项目详细
export function getProject(id) {
  return request({
    url: '/jacoco/project/' + id,
    method: 'get'
  })
}

// 新增jacoco项目
export function addProject(data) {
  return request({
    url: '/jacoco/project',
    method: 'post',
    data: data
  })
}

// 修改jacoco项目
export function updateProject(data) {
  return request({
    url: '/jacoco/project',
    method: 'put',
    data: data
  })
}

// 删除jacoco项目
export function delProject(id) {
  return request({
    url: '/jacoco/project/' + id,
    method: 'delete'
  })
}

// 导出jacoco项目
export function exportProject(query) {
  return request({
    url: '/jacoco/project/export',
    method: 'get',
    params: query
  })
}

// 执行jacoco项目
export function runProject(data) {
  console.log(data)
  return request({
    url: '/jacoco/project/run',
    method: 'post',
    data: {'id': data},
  })
  //alter(111);
  //return data;
}

// 查看jacoco项目历史记录
export function historyProject(data) {
  return request({
    url: '/jacoco/project/history',
    method: 'post',
    data: data
  })
}
