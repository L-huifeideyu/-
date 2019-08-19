<template>
  <div class="login">
    <div class="login-form">
      <div class="login-header">
        <img src="../../assets/images/logo.svg" width="100" height="100" alt="">
        <p>{{ $Config.siteName }}</p>
      </div>
      <el-input
          placeholder="请输入用户名"
          suffix-icon="fa fa-user"
          v-model="userName"
          style="margin-bottom: 18px"
      >
      </el-input>

      <el-input
          placeholder="请输入密码"
          suffix-icon="fa fa-keyboard-o"
          v-model="password"
          type="password"
          style="margin-bottom: 18px"
          @keyup.native.enter="login"
      >
      </el-input>

      <el-button
          type="primary"
          style="width: 100%;margin-bottom: 18px"
          @click.native="login"
      >登录
      </el-button>
      <div>
        <el-checkbox v-model="Remenber"> Remenber</el-checkbox>
        <a href="javascript:;" style="float: right;color: #3C8DBC;font-size: 14px">Register</a>
      </div>

    </div>
  </div>
</template>

<script>
  import {setToken} from '../../utils/dataStorage'
  import {login as loginApi} from '../../api/demo'

  export default {
    data() {
      return {
        userName: '',
        password: '',
        Remenber: true,

      }
    },
    methods: {
      login() {

        let data = {
          username:this.userName,
          password:this.password
        }

        loginApi(data).then(result=>{
          if(result.status == 200){
            let { user_photo,name } = result.data

            sessionStorage.setItem("name",name)
            sessionStorage.setItem("user_photo",user_photo)
            this.$router.push({path: '/'});
          }
        }).catch(_=>{})


          //

      }
    }
  }
</script>

<style lang="scss">
  @import "Login.scss";
</style>
