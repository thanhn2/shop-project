<template>
  <div>
    <button
      type="button"
      class="btn btn-danger btn-arrow-left"
      id="insertBtn"
      data-toggle="modal"
      data-target="#insertModal"
    >Add product</button>
    <!-- Modal form insert -->
    <div
      class="modal fade"
      id="insertModal"
      tabindex="-1"
      role="dialog"
      aria-labelledby="insertModalLabel"
      aria-hidden="true"
    >
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="insertModalLabel">Thêm sản phẩm</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            <form>
              <div class="form-group row">
                <label class="col-sm-4 col-form-label">Tên sản phẩm:</label>
                <div class="col-sm-8">
                  <input type="text" class="form-control" placeholder="Tên sản phẩm..." />
                </div>
              </div>

              <div class="form-group row">
                <label class="col-sm-4 col-form-label">Giá sản phẩm:</label>
                <div class="col-sm-8">
                  <input type="text" class="form-control" placeholder="Giá sản phẩm..." id="price" />
                </div>
              </div>
              <div class="form-group row">
                <label class="col-sm-4 col-form-label">Số lượng:</label>
                <div class="col-sm-8">
                  <input
                    type="number"
                    class="form-control"
                    placeholder="Số lượng sản phẩm..."
                    min="0"
                  />
                </div>
              </div>
              <div class="form-group row">
                <label class="col-sm-4 col-form-label">Giảm giá:</label>
                <div class="col-sm-8">
                  <input
                    type="number"
                    class="form-control"
                    placeholder="Giảm giá..."
                    max="100"
                    min="0"
                  />
                  <span class="valuePadding">%</span>
                </div>
              </div>
              <div class="form-group row">
                <label class="col-sm-4 col-form-label">Mô tả:</label>
                <div class="col-sm-8">
                  <textarea class="form-control" placeholder="Mô tả..."></textarea>
                </div>
              </div>
              <div class="form-group row">
                <div class="col-sm-4">Hot</div>
                <div class="col-sm-8">
                  <div class="form-check">
                    <input class="form-check-input" type="checkbox" id="hotFlag" />
                    <label class="form-check-label" for="hotFlag">Yes</label>
                  </div>
                </div>
              </div>
              <div class="modal-footer">
                <button type="submit" class="btn btn-primary">Save</button>
                <button type="reset" class="btn btn-secondary">Clear</button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
    <!-- /Modal form insert -->
  </div>
</template>

<script>
export default {
  name: "Add",
  props: {
    msg: String
  }
};
</script>