<template>
  <div>
    <h3 class="pb-1 font-italic border-bottom">From the Firehose</h3>
    <div class="input-group mb-3">
      <input type="text" class="form-control" placeholder="Search..." />
      <div class="input-group-append">
        <button class="btn btn-outline-secondary" type="button">X</button>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: "Search",
  props: {
    msg: String
  }
};
</script>