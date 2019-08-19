<template>
  <div class="user-list">
    <ToolBar>
      <el-button type="primary" icon="el-icon-plus" size="small" @click="editUser(false)">添加</el-button>
      <div style="float: right">
        <el-input
            placeholder="请输入用户昵称！"
            size="small"
            style="width: 140px"
            v-model="params.name"
            @clear="searchUser"
            clearable>
        </el-input>
        <el-button @click="searchUser" type="success" icon="el-icon-search" size="small"></el-button>
      </div>
    </ToolBar>
    <el-table
        :data="usersData"
        border
        ref="table"
        style="width: 100%">
      <el-table-column
          prop="username"
          label="登录账号">
      </el-table-column>
      <el-table-column
          prop="name"
          label="真实姓名">
      </el-table-column>
      <el-table-column
          prop="user_email"
          label="邮箱">
      </el-table-column>
      <el-table-column
          prop="user_phone"
          label="手机">
      </el-table-column>
      <el-table-column
          prop="user_role"
          label="用户角色">
        <!--<div slot-scope="scope" style="width: 100%;text-align: center">{{ scope.row.result ?
          $Config.tizhiCategories[scope.row.result]:'未判定' }}
        </div>-->
      </el-table-column>
      <el-table-column
          prop="sex"
          width="66"
          label="性别">
        <div slot-scope="scope" style="width: 100%;text-align: center">{{ $Config.sex[scope.row.sex] }}</div>
      </el-table-column>
      <el-table-column
          label="操作"
          :render-header="tableAction"
          width="180">
        <template slot-scope="scope">
            <el-button type="success" icon="el-icon-zoom-in" size="mini" circle="true"></el-button>
            <el-button type="warning" icon="el-icon-edit" size="mini" circle="true"></el-button>
            <el-button type="danger" icon="el-icon-error" size="mini" circle="true"></el-button>
        </template>
      </el-table-column>
    </el-table>
      <div>
          <el-pagination
                  background="true"
                  @size-change="handleSizeChange"
                  @current-change="handleCurrentChange"
                  :current-page="currentIndex"
                  :page-sizes="[10, 20, 30, 40]"
                  :page-size=pageSize
                  layout=" prev, pager, next,sizes,total"
                  :total=total>
          </el-pagination>
      </div>
  </div>
</template>

<script>
  import ToolBar from '@/components/ToolBar.vue';
  import HelpHint from '@/components/HelpHint.vue';
  import {getUserList} from '@/api/sys.js';
  export default {
    data() {
      return {
        params: {
          name: '',
        },
        usersData: [],
          currentIndex:1,
          pageSize:10,
          name:"",
          user_role:"",
          total:""
      }
    },
    methods: {
        handleSizeChange(val) {
            console.log(`每页 ${val} 条`);
        },
        handleCurrentChange(val) {
            console.log(`当前页: ${val}`);
        },
        getUserList(){
          let data = {
              currentIndex: this.currentIndex,
              pageSize: this.pageSize,
              name:this.name,
              user_role: this.user_role
          }
          getUserList(data).then(result => {
              if(result.status == "100"){
                  let { list,total} = result.data
                  this.usersData = list
                  this.total = total

              }else{
                  this.$message.warning(result.msg)
              }
          })
        },


    },
    mounted(){
        this.getUserList()
    },
    components: {
      ToolBar,HelpHint
    }
  }
</script>
<style lang="scss">

</style>
