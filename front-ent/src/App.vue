<template>
  <div id="app">
    <div class="container">
      <!-- Add -->
      <Add></Add>
      <!-- Header -->
      <Header></Header>

      <main role="main" class="container">
        <div class="row">
          <div class="col-md-8 blog-main">
            <!-- Search -->
            <Search></Search>

            <!-- List -->
            <List></List>
          </div>
          <!-- /.blog-main -->

          <!-- Cart -->
          <Cart></Cart>
        </div>
        <!-- /.row -->
      </main>
      <!-- /.container -->
    </div>

    <!-- Footer -->
    <Footer></Footer>
  </div>
</template>

<script>
import Add from "./components/Add.vue";
import Header from "./components/Header.vue";
import Search from "./components/Search.vue";
import List from "./components/List.vue";
import Cart from "./components/Cart.vue";
import Footer from "./components/Footer.vue";

export default {
  name: "App",
  components: {
    Add,
    Header,
    Search,
    List,
    Cart,
    Footer
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style src="@/assets/css/blog.css">
</style>