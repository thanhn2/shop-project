<template>
  <!-- Modal buy all -->
  <div
    class="modal fade"
    id="buyAllModal"
    tabindex="-1"
    role="dialog"
    aria-labelledby="buyAllModalLabel"
    aria-hidden="true"
  >
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="buyAllModalLabel">Modal title</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">...</div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
          <button type="button" class="btn btn-primary">Save changes</button>
        </div>
      </div>
    </div>
  </div>
  <!-- /Modal buy all -->
</template>

<script>
export default {
  name: "Buy-Detail",
  props: {
    msg: String
  }
};
</script>