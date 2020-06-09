<template>
  <aside class="col-md-4 blog-sidebar">
    <div class="p-4 mb-3 bg-light rounded d-flex justify-content-between">
      <b class="font-italic my-2">Your cart:</b>
      <button
        type="button"
        class="btn btn-outline-primary"
        data-toggle="modal"
        data-target="#buyAllModal"
      >Buy all</button>
    </div>

    <div class="p-4">
      <ol class="list-unstyled mb-0 list-buy">
        <li class="d-flex justify-content-between">
          <span>
            <a>&#8864;</a> March 2014
          </span>
          <span>10000</span>
        </li>
        <li>March 2014</li>
        <li>March 2014</li>
      </ol>
      <hr />
      <div class="d-flex justify-content-between">
        <span>Thanh tien:</span>
        <b class="paymoney">1.490.000₫</b>
      </div>
    </div>

    <!-- Modal buy all -->
    <BuyDetail></BuyDetail>
  </aside>
  <!-- /.blog-sidebar -->
</template>

<script>
import BuyDetail from "./BuyDetail.vue";

export default {
  name: "Cart",
  components: {
    BuyDetail
  },
  props: {
    msg: String
  }
};
</script>